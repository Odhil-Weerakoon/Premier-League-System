import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class SortByPointsService {

  constructor(private http: HttpClient) { }

  public getSortByPointsTable(): Observable<any>{
    return this.http.get('http://localhost:8080/lk.PremierLeague/Football/total-points-sorted');
  }

}
