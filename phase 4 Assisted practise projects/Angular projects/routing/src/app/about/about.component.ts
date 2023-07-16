import { Component } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent {
  constructor(private animalservice:ServiceService){}
  animals=this.animalservice.animals
  addAnimal(name:any){
    this.animals.push(name.value)
  }
}
