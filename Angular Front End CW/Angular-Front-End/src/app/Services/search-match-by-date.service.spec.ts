import { TestBed } from '@angular/core/testing';

import { SearchMatchByDateService } from './search-match-by-date.service';

describe('SearchMatchByDateService', () => {
  let service: SearchMatchByDateService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SearchMatchByDateService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
