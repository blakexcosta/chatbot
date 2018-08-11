from chatterbot import ChatBot
from chatterbot.trainers import ListTrainer

#making a new chatbot called ron maximus
chatbot = ChatBot("Ron Maximus")#, input_adapter="chatterbot.input.VariableInputTypeAdapter")

conversation = [
    "Hello",
    "Hi there!",
    "How are you doing?",
    "I'm doing great.",
    "That is good to hear",
    "Thank you.",
    "You're welcome.",
    "I like rainbow six seige",
    "caveira makes me mad"
]

#setting the trainer as a list trainer
chatbot.set_trainer(ListTrainer)
#training it with the conversation that has been given
chatbot.train(conversation)

#response = chatbot.get_response("Good morning!")
#print(response)

while True:
    text = input("response: ")
    if(text == ""):
        break
    else:
        response = chatbot.get_response(text)
        print(response)
