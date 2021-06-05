import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PremierLeagueTableService {

  constructor(private http: HttpClient) { }

  public getPremierLeagueTable(): Observable<any>{
    return this.http.get('http://localhost:8080/lk.PremierLeague/Football/premier-league-table');
  }
}
