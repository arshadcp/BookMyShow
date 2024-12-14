package com.arshad.BookMyShow.Service;

import com.arshad.BookMyShow.Model.*;
import com.arshad.BookMyShow.Model.Enum.*;
import com.arshad.BookMyShow.Service.Interface.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class InitServiceImpl implements InitService {
    @Autowired
    CityService cityService;
    @Autowired
    TheaterService theaterService;
    @Autowired
    AuditoriumService auditoriumService;
    @Autowired
    ShowSeatService showSeatService;
    @Autowired
    SeatService seatService;
    @Autowired
    MovieService movieService;
    @Autowired
    ShowService showService;

    public boolean initialise(){
        City delhicity=new City("Delhi");
        City mumbaicity=new City("Mumbai");
        cityService.saveCity(delhicity);
        cityService.saveCity(mumbaicity);

        Theater t1=new Theater("Ma","in Phenix mall Mumbai");
        Theater t2=new Theater("Johny","Nexus Mall Mumbai");
        theaterService.saveTheater(t1);
        theaterService.saveTheater(t2);
        Theater savedT1=theaterService.getTheaterByName("Ma");


       City savedCity1=cityService.getCityByName("Delhi");
       // List<Theater> theaterList=savedCity1.getTheaters();
        List<Theater> theaterList=new ArrayList<>();
        theaterList.add(savedT1);//added theater to city
        //theaterList.add(savedT2);
        savedCity1.setTheaters(theaterList);//adding list of theaters to city
        cityService.saveCity(savedCity1);

        for(int i=0;i<5;i++ ) {//seat creation
            Seat seat = new Seat(i, i,i+ "" +i, SeatType.GOLD, SeatStatus.AVAILABLE);
            seatService.saveSeat(seat);
           // Seat savedseat1 = seatService.getSeatBySeatNumber(i+ "" + i);
        }
        List<Seat> seatsAudi=seatService.findAllSeat();//return all the data of the table

        Auditorium audi1=new Auditorium("Venus",5);

        List<AuditoriumFeature> audiFeature=new ArrayList<>();
        audiFeature.add(AuditoriumFeature.DOLBY);
        audiFeature.add(AuditoriumFeature.THREED);
        audi1.setAudiFeature(audiFeature);
        //audi1.setSeats(seatsAudi);
        auditoriumService.saveAudi(audi1);
        Auditorium savedAud=auditoriumService.getAuditoriumByName("Venus");

        Theater savedTheaters=theaterService.getTheaterByName("Ma");
       List<Auditorium> audiList= new ArrayList<>();
        audiList.add(savedAud);//added auditorium to List
        savedTheaters.setAudi(audiList);//adding list of auditoriums to theater

        theaterService.saveTheater(savedTheaters);

        Movie movie= new Movie("Avengers","Best movie");
        ArrayList<MovieFeature> movieFeatures= new ArrayList<>(List.of(MovieFeature.DOLBY,MovieFeature.IMAX));
        movie.setFeatures(movieFeatures);
        Movie savedMovie=movieService.saveMovie(movie);

        Show show =new Show("EveningShow");
        show.setStartTime(LocalDateTime.now());
        show.setEndTime(LocalDateTime.now().plusMinutes(60));

        show.setMovie(movieService.findMovieByName("Avengers"));
        Auditorium savedAudi2=auditoriumService.getAuditoriumByName("Venus");
       show.setAuditorium(savedAudi2);
       Show show1= showService.saveShow(show);//--

       for(int i=0;i<5;i++) {//5showseat
           ShowSeat showSeat = new ShowSeat(100,showService.getShowById(1),seatService.getSeatBySeatNumber(i+""+i),ShowSeatStatus.AVAILABLE);

           showSeatService.saveShowseat(showSeat);
       }

        return true;
    }
}
