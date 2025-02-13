package cat.itb.m78.exercices

data class Question(val statement: String, val answers: List<Answer>)
data class Answer(val text: String, val correct: Boolean)

val questions: List<Question> = listOf(
    Question(
        "Question 1",
        listOf(
            Answer("Answer 11", true),
            Answer("Answer 12", false),
            Answer("Answer 13", false),
            Answer("Answer 14", false)
        ).shuffled()
    ),
    Question(
        "Question 2",
        listOf(
            Answer("Answer 21", true),
            Answer("Answer 22", false),
            Answer("Answer 23", false),
            Answer("Answer 24", false)
        ).shuffled()
    ),
    Question(
        "Question 3",
        listOf(
            Answer("Answer 31", true),
            Answer("Answer 32", false),
            Answer("Answer 33", false),
            Answer("Answer 34", false)
        ).shuffled()
    )
)