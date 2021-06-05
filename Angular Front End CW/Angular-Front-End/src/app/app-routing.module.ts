import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PremierLeagueTableComponent } from './premier-league-table/premier-league-table.component';
import {SortByPointsComponent} from './sort-by-points/sort-by-points.component';
import {SortByWinsComponent} from './sort-by-wins/sort-by-wins.component';
import {SortByGoalsComponent} from './sort-by-goals/sort-by-goals.component';
import {RandomMatchComponent} from './random-match/random-match.component';
import {SortByDateComponent} from './sort-by-date/sort-by-date.component';
import {SearchMatchByDateComponent} from './search-match-by-date/search-match-by-date.component';
import {HomePageComponent} from './home-page/home-page.component';

const routes: Routes = [
  {path : '', component : HomePageComponent},
  {path : 'home-page', component : HomePageComponent},
  {path : 'premier-league-table', component : PremierLeagueTableComponent},
  {path : 'sort-by-points', component : SortByPointsComponent},
  {path : 'sort-by-wins', component : SortByWinsComponent },
  {path : 'sort-by-goals', component : SortByGoalsComponent },
  {path : 'random-match', component : RandomMatchComponent },
  {path : 'sort-by-date', component : SortByDateComponent },
  {path : 'search-match-by-date', component : SearchMatchByDateComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [PremierLeagueTableComponent, SortByPointsComponent];
