fetch('questions.json')
.then(response=>response.json())
.then(data=>{
console.log(data)
const quizContainer=document.getElementById("quiz-container");
const questionElement=document.getElementById("question");
const choicesElement=document.getElementById("choices");
const submitButton= document.getElementById("submit");      
const resultContainer=document.getElementById("result-container");
const resultElement=document.getElementById("result");  


let currentQuestionIndex=0;
let score=0;


function loadQuestion(){
   
    const currentQuestion=data.questions[currentQuestionIndex];
    questionElement.textContent=currentQuestion.question;


    choicesElement.innerHTML='';
    currentQuestion.choices.forEach(choice=>{
        const li=document.createElement('li');
        const input=document.createElement('input');
        input.setAttribute('type','radio');
        input.setAttribute('name','answer');
        input.setAttribute('value',choice);
        li.appendChild(input);
        li.appendChild(document.createTextNode(choice));
        choicesElement.appendChild(li);
    });


}


function checkAnswer(){
    const selectedAnswer=document.querySelector('input[name="answer"]:checked');


    if(selectedAnswer){
        const userAnswer=selectedAnswer.value;
        const currentQuestion=data.questions[currentQuestionIndex];
        if(userAnswer===currentQuestion.correctAnswer){
            score++;
        }
        currentQuestionIndex++;


        if(currentQuestionIndex < data.questions.length){
            loadQuestion();
        }
        else{
            showResult();
        }
    }
}




function showResult(){
    quizContainer.style.display='none';
    resultContainer.style.display='block';
    resultElement.textContent=`you scored ${score} out of ${data.questions.length} questions`;
}


submitButton.addEventListener('click',checkAnswer);


loadQuestion();

})
