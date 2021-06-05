import { TestBed } from '@angular/core/testing';

import { SortByDateService } from './sort-by-date.service';

describe('SortByDateService', () => {
  let service: SortByDateService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SortByDateService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
