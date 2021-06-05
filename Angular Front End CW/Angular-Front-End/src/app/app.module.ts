import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { SortByWinsComponent } from './sort-by-wins/sort-by-wins.component';
import {HttpClientModule} from '@angular/common/http';
import { SortByPointsComponent } from './sort-by-points/sort-by-points.component';
import { SortByGoalsComponent } from './sort-by-goals/sort-by-goals.component';
import { RandomMatchComponent } from './random-match/random-match.component';
import { SortByDateComponent } from './sort-by-date/sort-by-date.component';
import { SearchMatchByDateComponent } from './search-match-by-date/search-match-by-date.component';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {FormsModule} from '@angular/forms';
import { HomePageComponent } from './home-page/home-page.component';

@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    SortByWinsComponent,
    SortByPointsComponent,
    SortByGoalsComponent,
    RandomMatchComponent,
    SortByDateComponent,
    SearchMatchByDateComponent,
    HomePageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    Ng2SearchPipeModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
