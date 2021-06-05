import { TestBed } from '@angular/core/testing';

import { SortByWinsService } from './sort-by-wins.service';

describe('SortByWinsService', () => {
  let service: SortByWinsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SortByWinsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
