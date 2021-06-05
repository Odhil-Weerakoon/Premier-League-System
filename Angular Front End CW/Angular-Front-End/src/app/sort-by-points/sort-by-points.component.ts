import { Component, OnInit } from '@angular/core';
import {SortByPointsService} from '../Services/sort-by-points.service';

@Component({
  selector: 'app-sort-by-points',
  templateUrl: './sort-by-points.component.html',
  styleUrls: ['./sort-by-points.component.css']
})
export class SortByPointsComponent implements OnInit {

  sortedPointsTable: any;


  constructor(private totPointsSorted: SortByPointsService) { }

  ngOnInit(): void {
    this.totPointsSorted.getSortByPointsTable().subscribe(data => this.sortedPointsTable = data);
  }

}
