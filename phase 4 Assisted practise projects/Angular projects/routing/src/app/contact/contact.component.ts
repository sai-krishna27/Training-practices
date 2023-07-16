import { Component } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent {
  constructor(private animalservice:ServiceService){}
  animals=this.animalservice.animals
}
