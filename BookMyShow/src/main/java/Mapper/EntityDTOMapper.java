package Mapper;

import com.arshad.BookMyShow.DTO.UserSignUpResponseDTO;
import com.arshad.BookMyShow.Model.User;

public class EntityDTOMapper {
    public  static UserSignUpResponseDTO toDTO(User user){
          UserSignUpResponseDTO responseDto=new UserSignUpResponseDTO();
          responseDto.setName(user.getName());
          responseDto.setEmail(user.getEmail());
          return responseDto;
    }
}
