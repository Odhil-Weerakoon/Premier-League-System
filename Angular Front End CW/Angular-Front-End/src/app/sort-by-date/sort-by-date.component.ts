import { Component, OnInit } from '@angular/core';
import {SortByDateService} from '../Services/sort-by-date.service';


@Component({
  selector: 'app-sort-by-date',
  templateUrl: './sort-by-date.component.html',
  styleUrls: ['./sort-by-date.component.css']
})
export class SortByDateComponent implements OnInit {

  sortedDateTable: any;


  constructor(private goalsSorted: SortByDateService) { }

  ngOnInit(): void {
    this. goalsSorted.getSortByDateTable().subscribe(data => this.sortedDateTable = data);
  }
}
