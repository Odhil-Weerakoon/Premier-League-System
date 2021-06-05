import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SortByWinsService {

  constructor(private http: HttpClient) { }

  public getSortByWinsTable(): Observable<any>{
    return this.http.get('http://localhost:8080/lk.PremierLeague/Football/no-of-wins-sorted');
  }

}
