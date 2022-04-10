import{Component} from "@angular/core";
@Component({
selector:'my-tag',
templateUrl:"./child.component.html",
styleUrls:["./child.component.css"]



})
export class childComponent{
    msg:string="this is child component";
}