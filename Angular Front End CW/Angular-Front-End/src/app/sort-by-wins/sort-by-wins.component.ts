import { Component, OnInit } from '@angular/core';
import {SortByWinsService} from '../Services/sort-by-wins.service';

@Component({
  selector: 'app-sort-by-wins',
  templateUrl: './sort-by-wins.component.html',
  styleUrls: ['./sort-by-wins.component.css']
})
export class SortByWinsComponent implements OnInit {

  sortedWinsTable: any;


  constructor(private noOfWinsSorted: SortByWinsService) { }

  ngOnInit(): void {
    this.noOfWinsSorted.getSortByWinsTable().subscribe(data => this.sortedWinsTable = data);
  }

}
