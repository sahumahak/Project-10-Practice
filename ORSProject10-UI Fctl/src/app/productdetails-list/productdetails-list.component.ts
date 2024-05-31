import { Component, OnInit } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-productdetails-list',
  templateUrl: './productdetails-list.component.html',
  styleUrls: ['./productdetails-list.component.css']
})
export class ProductdetailsListComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super( locator.endpoints.PRODUCTDETAILS, locator, route);


  }
  populateForm(form, data) {
    console.log(form.id + 'formid in mahak');
    form.id = data.id;
  }

}