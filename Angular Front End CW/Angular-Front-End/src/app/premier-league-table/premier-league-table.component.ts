import { Component, OnInit } from '@angular/core';
import {PremierLeagueTableService} from '../Services/premier-league-table.service';

@Component({
  selector: 'app-premier-league-table',
  templateUrl: './premier-league-table.component.html',
  styleUrls: ['./premier-league-table.component.css']
})
export class PremierLeagueTableComponent implements OnInit {


  premierLeagueTable: any;

  constructor(private premierLeagueClubs: PremierLeagueTableService) {
  }

  ngOnInit(): void {
    this.premierLeagueClubs.getPremierLeagueTable().subscribe(data => this.premierLeagueTable = data);
  }
}
