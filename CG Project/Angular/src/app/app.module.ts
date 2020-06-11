import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddTheaterComponent } from './add-theater/add-theater.component';
import { HeaderComponent } from './header/header.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { AddScreenComponent } from './add-screen/add-screen.component';
import { AddShowComponent } from './add-show/add-show.component';
import { GetAllTheatersComponent } from './get-all-theaters/get-all-theaters.component';
import { GetAllMoviesComponent } from './get-all-movies/get-all-movies.component';
import { GetAllScreensComponent } from './get-all-screens/get-all-screens.component';
import { GetAllShowsComponent } from './get-all-shows/get-all-shows.component';
import { UpdateTheaterComponent } from './update-theater/update-theater.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { SearchTheaterComponent } from './search-theater/search-theater.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { AuthGuard } from './auth.guard';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    AddTheaterComponent,
    HeaderComponent,
    AddMovieComponent,
    AddScreenComponent,
    AddShowComponent,
    GetAllTheatersComponent,
    GetAllMoviesComponent,
    GetAllScreensComponent,
    GetAllShowsComponent,
    UpdateTheaterComponent,
    SignInComponent,
    PagenotfoundComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path:'addTheater', component:AddTheaterComponent},
      {path:'addMovie', component:AddMovieComponent},
      {path:'addScreen', component:AddScreenComponent},
      {path:'addShow', component:AddShowComponent},
      {path:'getAllTheaters', component:GetAllTheatersComponent
      },
      {path:'getAllMovies', component:GetAllMoviesComponent},
      {path:'getAllScreens', component:GetAllScreensComponent},
      {path:'getAllShows', component:GetAllShowsComponent},
      {path:'update-theater/:id', component:UpdateTheaterComponent},
      {path:'signIn', component:SignInComponent},
        {path:'',component:HomeComponent},
      { path: '**', component: PagenotfoundComponent }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
