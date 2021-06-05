import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchMatchByDateComponent } from './search-match-by-date.component';

describe('SearchMatchByDateComponent', () => {
  let component: SearchMatchByDateComponent;
  let fixture: ComponentFixture<SearchMatchByDateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SearchMatchByDateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchMatchByDateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
