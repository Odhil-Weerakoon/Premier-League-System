import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';



@Component({
  selector: 'app-random-match',
  templateUrl: './random-match.component.html',
  styleUrls: ['./random-match.component.css']
})
export class RandomMatchComponent implements OnInit {

  randomMatchTable: any;
  randomMatch: any;

  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
    const response = this.http.get('http://localhost:8080/lk.PremierLeague/Football/matches-played');
    response.subscribe((data) => this.randomMatchTable = data);
  }

  playMatch(): void{
    const response = this.http.get('http://localhost:8080/lk.PremierLeague/Football/random-match');
    response.subscribe((data) => this.randomMatchTable = data);
  }
}
