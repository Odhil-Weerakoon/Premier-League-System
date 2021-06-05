import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PremierLeagueTableComponent } from './premier-league-table.component';

describe('PremierLeagueTableComponent', () => {
  let component: PremierLeagueTableComponent;
  let fixture: ComponentFixture<PremierLeagueTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PremierLeagueTableComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PremierLeagueTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
