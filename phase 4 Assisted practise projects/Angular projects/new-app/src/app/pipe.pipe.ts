import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'pipe'
})
export class PipePipe implements PipeTransform {

  /*transform(value: string,param1:number,param2:number ): unknown {
    return value.substring(param1,param2);
  }*/
  transform(value: any,param1:string): string {
    if(value.gender=="m")
    {
      return "Hello Mr. "+value.name+" "+param1


    }
    else{
      return "Hello Miss. "+value.name+" "+param1
    }

}
}
