import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SortByPointsComponent } from './sort-by-points.component';

describe('SortByPointsComponent', () => {
  let component: SortByPointsComponent;
  let fixture: ComponentFixture<SortByPointsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SortByPointsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SortByPointsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
