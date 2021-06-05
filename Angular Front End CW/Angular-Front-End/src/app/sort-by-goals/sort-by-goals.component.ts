import { Component, OnInit } from '@angular/core';
import {SortByGoalsService} from '../Services/sort-by-goals.service';

@Component({
  selector: 'app-sort-by-goals',
  templateUrl: './sort-by-goals.component.html',
  styleUrls: ['./sort-by-goals.component.css']
})
export class SortByGoalsComponent implements OnInit {

  sortedGoalsTable: any;


  constructor(private goalsSorted: SortByGoalsService) { }

  ngOnInit(): void {
    this. goalsSorted.getSortByGoalsTable().subscribe(data => this.sortedGoalsTable = data);
  }

}
