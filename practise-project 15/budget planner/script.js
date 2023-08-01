function estimateBudget(){
  let sum=0;
  var deal=document.querySelectorAll('input[name="deals"]:checked');
  deal.forEach(d => { 
    sum=sum+Number(d.value.substring(1,d.value.length))
  });
  document.write('Annual budget for the team is - $'+sum)
}

let total=0
function addDeal(){
  document.getElementById("deals").innerText=""
  let product=document.manager.product.value
  let expense=document.manager.expense.value
  let deal=document.manager.deal.value
  let vendor=document.manager.vendor.value
  let dealDetails=document.getElementById("details")
  total=total+Number(expense)
  let s=`<h2>Deal details</h2>
  <p>Vaendor name - ${vendor}</p>
  <p>Product name - ${product}</p>
  <p>Deal description - ${deal}</p>
  <p name="cost">Expenses - $${expense}</p>
<hr>`
document.getElementById("budget").innerText=`${total}`
dealDetails.innerHTML=dealDetails.innerHTML+s
product=document.manager.product.value=""
expense=document.manager.expense.value=""
deal=document.manager.deal.value=""
vendor=document.manager.vendor.value=""


}
