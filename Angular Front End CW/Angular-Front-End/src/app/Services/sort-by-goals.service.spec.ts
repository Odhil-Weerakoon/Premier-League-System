import { TestBed } from '@angular/core/testing';

import { SortByGoalsService } from './sort-by-goals.service';

describe('SortByGoalsService', () => {
  let service: SortByGoalsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SortByGoalsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
