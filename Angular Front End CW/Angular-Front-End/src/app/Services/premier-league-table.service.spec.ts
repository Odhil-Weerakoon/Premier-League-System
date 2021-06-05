import { TestBed } from '@angular/core/testing';

import { PremierLeagueTableService } from './premier-league-table.service';

describe('PremierLeagueTableService', () => {
  let service: PremierLeagueTableService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PremierLeagueTableService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
