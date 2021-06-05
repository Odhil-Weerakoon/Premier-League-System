import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SortByGoalsService {

  constructor(private http: HttpClient) { }

  public getSortByGoalsTable(): Observable<any>{
    return this.http.get('http://localhost:8080/lk.PremierLeague/Football/goals-scored-sorted');
  }
}
