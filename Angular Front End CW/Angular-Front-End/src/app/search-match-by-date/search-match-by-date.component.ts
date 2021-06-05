import { Component, OnInit } from '@angular/core';
import {SearchMatchByDateService} from '../Services/search-match-by-date.service';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-search-match-by-date',
  templateUrl: './search-match-by-date.component.html',
  styleUrls: ['./search-match-by-date.component.css']
})
export class SearchMatchByDateComponent implements OnInit {

  searchDateTable: any;
  date: any;




  constructor(private searchByDate: SearchMatchByDateService, private http: HttpClient) { }



  ngOnInit(): void {
    this.searchByDate.getSearchByDateTable().subscribe(data => this.searchDateTable = data);
  }

  sendMatchDate(): void {
    const url = 'http://localhost:8080/lk.PremierLeague/Football/match-date';
    this.http.post(url, this.date).subscribe(
      res => {location.reload(); },
      err => {alert('Please Enter a valid Date of the Played match'); }
    );
  }
}
