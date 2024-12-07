package com.arshad.BookMyShow.Model;

import com.arshad.BookMyShow.Model.Enum.MovieFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
   private String name;
   private String description;
    @ManyToMany
   private List<Actor> actor;
    @ElementCollection
  @Enumerated(EnumType.STRING)
   private List<MovieFeature> features;
}
