import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VendedorComponent } from './vendedor.component';

describe('VendedorComponent', () => {
  let component: VendedorComponent;
  let fixture: ComponentFixture<VendedorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VendedorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VendedorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
