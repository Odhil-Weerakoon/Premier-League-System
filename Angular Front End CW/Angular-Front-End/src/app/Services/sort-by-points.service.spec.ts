import { TestBed } from '@angular/core/testing';

import { SortByPointsService } from './sort-by-points.service';

describe('SortByPointsService', () => {
  let service: SortByPointsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SortByPointsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
