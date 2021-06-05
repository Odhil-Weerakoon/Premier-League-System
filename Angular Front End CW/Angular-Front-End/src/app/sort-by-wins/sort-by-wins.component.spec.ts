import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SortByWinsComponent } from './sort-by-wins.component';

describe('SortByWinsComponent', () => {
  let component: SortByWinsComponent;
  let fixture: ComponentFixture<SortByWinsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SortByWinsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SortByWinsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
