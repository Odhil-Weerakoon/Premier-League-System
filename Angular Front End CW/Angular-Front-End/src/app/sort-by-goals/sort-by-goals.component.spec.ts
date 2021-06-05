import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SortByGoalsComponent } from './sort-by-goals.component';

describe('SortByGoalsComponent', () => {
  let component: SortByGoalsComponent;
  let fixture: ComponentFixture<SortByGoalsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SortByGoalsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SortByGoalsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
