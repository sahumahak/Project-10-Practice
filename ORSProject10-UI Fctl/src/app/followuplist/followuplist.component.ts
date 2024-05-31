import { Component, OnInit } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-followuplist',
  templateUrl: './followuplist.component.html',
  styleUrls: ['./followuplist.component.css']
})
export class FollowuplistComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super( locator.endpoints.FOLLOWUP, locator, route);


  }
  populateForm(form, data) {
    console.log(form.id + 'formid in mahak');
    form.id = data.id;
  }

}
