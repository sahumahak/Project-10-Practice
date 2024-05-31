import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductdetailsListComponent } from './productdetails-list.component';

describe('ProductdetailsListComponent', () => {
  let component: ProductdetailsListComponent;
  let fixture: ComponentFixture<ProductdetailsListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductdetailsListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductdetailsListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
