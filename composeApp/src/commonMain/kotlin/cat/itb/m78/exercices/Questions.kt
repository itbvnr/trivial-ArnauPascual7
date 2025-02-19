package cat.itb.m78.exercices

data class Question(val statement: String, val answers: List<Answer>)
data class Answer(val text: String, val correct: Boolean)

val easyQuestions: List<Question> = listOf(
    Question(
        "Qui va ser el líder de l'Alemanya nazi durant la Segona Guerra Mundial?",
        listOf(
            Answer("Winston Churchill", false),
            Answer("Adolf Hitler", true),
            Answer("Joseph Stalin", false),
            Answer("Franklin D. Roosevelt", false)
        ).shuffled()
    ),
    Question(
        "En quin any va començar la Segona Guerra Mundial?",
        listOf(
            Answer("1935", false),
            Answer("1940", false),
            Answer("1939", true),
            Answer("1942", false)
        ).shuffled()
    ),
    Question(
        "Quin país va ser ocupat per Alemanya a l'inici de la guerra?",
        listOf(
            Answer("França", false),
            Answer("Polònia", true),
            Answer("Itàlia", false),
            Answer("Noruega", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom de la batalla que va tenir lloc a Gran Bretanya el 1940?",
        listOf(
            Answer("Batalla de Stalingrad", false),
            Answer("Batalla de Midway", false),
            Answer("Batalla de Gran Bretanya", true),
            Answer("Batalla de Berlín", false)
        ).shuffled()
    ),
    Question(
        "Quin país va ser atacat per Japó al 1941, provocant la seva entrada en la guerra?",
        listOf(
            Answer("Xina", false),
            Answer("Estats Units", true),
            Answer("Austràlia", false),
            Answer("Rússia", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom de l'aliança que va lluitar contra les Potències de l'Eix?",
        listOf(
            Answer("L'OTAN", false),
            Answer("Les Forces Aliades", true),
            Answer("El Pacte de Varsòvia", false),
            Answer("L'Eix", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom del vaixell de guerra japonès que va atacar Pearl Harbor?",
        listOf(
            Answer("Yamato", false),
            Answer("Akagi", true),
            Answer("Missouri", false),
            Answer("Arizona", false)
        ).shuffled()
    ),
    Question(
        "Quina ciutat va ser bombardejada per les forces alemanyes a l'inici de la guerra?",
        listOf(
            Answer("Londres", false),
            Answer("Varsòvia", true),
            Answer("París", false),
            Answer("Roma", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom de l'operació per a invadir Normandia?",
        listOf(
            Answer("Operació Barbarroja", false),
            Answer("Operació Overlord", true),
            Answer("Operació Market Garden", false),
            Answer("Operació Typhoon", false)
        ).shuffled()
    ),
    Question(
        "Qui va ser el president dels Estats Units durant gran part de la guerra?",
        listOf(
            Answer("Thomas Jefferson", false),
            Answer("Franklin D. Roosevelt", true),
            Answer("Dwight D. Eisenhower", false),
            Answer("Harry S. Truman", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom de la primera bomba atòmica llançada sobre Hiroshima?",
        listOf(
            Answer("Little Boy", true),
            Answer("Fat Man", false),
            Answer("Big Thunder", false),
            Answer("Thunderbolt", false)
        ).shuffled()
    ),
    Question(
        "Quin país va ser el primer a declarar guerra a Alemanya?",
        listOf(
            Answer("França", false),
            Answer("Regne Unit", true),
            Answer("Itàlia", false),
            Answer("Estats Units", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom de la conferència on es va decidir la distribució del territori després de la guerra?",
        listOf(
            Answer("Conferència de Yalta", true),
            Answer("Conferència de Potsdam", false),
            Answer("Conferència de París", false),
            Answer("Conferència de Bretton Woods", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom de l'aviador que va volar sobre Japó llançant les bombes atòmiques?",
        listOf(
            Answer("Charles Lindbergh", false),
            Answer("Jimmy Doolittle", false),
            Answer("Paul Tibbets", true),
            Answer("Erich Hartmann", false)
        ).shuffled()
    ),
    Question(
        "Quina data es va signar la capitulació d'Alemanya?",
        listOf(
            Answer("7 de maig de 1945", false),
            Answer("8 de maig de 1945", true),
            Answer("9 de setembre de 1945", false),
            Answer("10 de novembre de 1945", false)
        ).shuffled()
    )
).shuffled()

val normalQuestions: List<Question> = listOf(
    Question(
        "Qui va ser el líder de la Unió Soviètica durant la Segona Guerra Mundial?",
        listOf(
            Answer("Nikita Khrushchev", false),
            Answer("Josef Stalin", true),
            Answer("Leon Trotsky", false),
            Answer("Mikhail Gorbachev", false)
        ).shuffled()
    ),
    Question(
        "Quina batalla va ser una de les més importants del front oriental i va marcar el començament de la retirada alemanya?",
        listOf(
            Answer("Batalla de Stalingrad", true),
            Answer("Batalla de Kursk", false),
            Answer("Batalla de Midway", false),
            Answer("Batalla de Normandia", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser l'objectiu de l'Operació Barbarroja?",
        listOf(
            Answer("Invadir la Gran Bretanya", false),
            Answer("Atacar la Unió Soviètica", true),
            Answer("Conquerir França", false),
            Answer("Conquerir el Nord d'Àfrica", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser la principal causa de la derrota de l'Alemanya nazi a Stalingrad?",
        listOf(
            Answer("El clima extremadament fred", true),
            Answer("La superioritat tecnològica soviètica", false),
            Answer("La falta de recursos alemanys", false),
            Answer("La resistència de la població local", false)
        ).shuffled()
    ),
    Question(
        "Quina ciutat va ser la seu del govern nazi a Alemanya durant la guerra?",
        listOf(
            Answer("Munic", false),
            Answer("Nuremberg", false),
            Answer("Berlín", true),
            Answer("Hamburgo", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser l'estratègia de la \"guerra relàmpago\" (Blitzkrieg) utilitzada per Alemanya?",
        listOf(
            Answer("Bombardejos aeris massius seguit de l'entrada de tancs", true),
            Answer("Guerres de trincheres", false),
            Answer("Bombardejos nuclears", false),
            Answer("Guerres d'escorcolls", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser la ciutat on es va signar la rendició de Japó?",
        listOf(
            Answer("Tòquio", false),
            Answer("Hiroshima", false),
            Answer("Kyoto", false),
            Answer("Tokyo Bay (vaixell Missouri)", true)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom de l'aliança de les potències de l'Eix?",
        listOf(
            Answer("Pacte de Varsòvia", false),
            Answer("Pacte Tripartit", true),
            Answer("Organització de les Nacions Unides", false),
            Answer("Aliança Atlàntica", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser la primera gran derrota naval de Japó a la Segona Guerra Mundial?",
        listOf(
            Answer("Batalla de Midway", true),
            Answer("Batalla de Pearl Harbor", false),
            Answer("Batalla de Coral Sea", false),
            Answer("Batalla de Guadalcanal", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser la conferència en la qual les potències aliades van planejar el futur de l'Europa postbèl·lica?",
        listOf(
            Answer("Conferència de Teheran", false),
            Answer("Conferència de Potsdam", false),
            Answer("Conferència de Yalta", true),
            Answer("Conferència de Bretton Woods", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom del primer ministre britànic durant la guerra?",
        listOf(
            Answer("Neville Chamberlain", false),
            Answer("Winston Churchill", true),
            Answer("Edward Heath", false),
            Answer("Harold Wilson", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom del primer vaixell de guerra nord-americà atacat a Pearl Harbor?",
        listOf(
            Answer("USS Arizona", true),
            Answer("USS Missouri", false),
            Answer("USS Lexington", false),
            Answer("USS Enterprise", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el resultat de la Batalla de Normandia?",
        listOf(
            Answer("Victòria alemanya", false),
            Answer("Victòria soviètica", false),
            Answer("Victòria aliada", true),
            Answer("Victòria japonesa", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser la batalla decisiva a l'oceà Pacífic que va marcar l'inici de la retirada japonesa?",
        listOf(
            Answer("Batalla de Coral Sea", false),
            Answer("Batalla de Guadalcanal", false),
            Answer("Batalla de Midway", true),
            Answer("Batalla de Leyte Gulf", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser la ciutat alemanya bombardejada pels Aliats que va quedar destruïda per la \"Operació Gomorra\"?",
        listOf(
            Answer("Berlín", false),
            Answer("Munic", false),
            Answer("Hamburg", true),
            Answer("Dresden", false)
        ).shuffled()
    )
).shuffled()

val hardQuestions: List<Question> = listOf(
    Question(
        "Quina va ser la principal estratègia militar del general alemany Erwin Rommel a l'Àfrica del Nord?",
        listOf(
            Answer("Guerra de trincheres", false),
            Answer("Guerra de guerrilles", false),
            Answer("Guerra de moviment amb força de blindats", true),
            Answer("Tàctiques de guerra submarina", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom de l'operació alemanya per invadir la Unió Soviètica?",
        listOf(
            Answer("Operació Overlord", false),
            Answer("Operació Barbarroja", true),
            Answer("Operació Sea Lion", false),
            Answer("Operació Crusader", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser la data de l'entrada en guerra dels Estats Units després de l'atac a Pearl Harbor?",
        listOf(
            Answer("11 de setembre de 1941", false),
            Answer("7 de desembre de 1941", true),
            Answer("10 de gener de 1942", false),
            Answer("3 d'octubre de 1942", false)
        ).shuffled()
    ),
    Question(
        "Qui va ser el comandant de les forces aliades a la Batalla de Normandia?",
        listOf(
            Answer("George Patton", false),
            Answer("Bernard Montgomery", false),
            Answer("Dwight D. Eisenhower", true),
            Answer("Omar Bradley", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser l'objectiu principal de la Conferència de Potsdam?",
        listOf(
            Answer("Discutir el futur d'Europa després de la guerra", true),
            Answer("Discutir la pau amb Japó", false),
            Answer("Firmar l'entrada dels Estats Units a la guerra", false),
            Answer("Crear l'ONU", false)
        ).shuffled()
    ),
    Question(
        "En quin camp de concentració es va dur a terme una gran revolta dels presoners jueus el 1943?",
        listOf(
            Answer("Auschwitz", false),
            Answer("Sobibor", true),
            Answer("Treblinka", false),
            Answer("Majdanek", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser la causa de la victòria de les forces aliades a la Batalla de Stalingrad?",
        listOf(
            Answer("La superioritat tecnològica de les armes alemanyes", false),
            Answer("La falta de subministraments alemanys", true),
            Answer("La retirada dels soviètics", false),
            Answer("L'entrada de les tropes nord-americanes", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom del líder japonès que va supervisar l'expansió del país durant la guerra?",
        listOf(
            Answer("Hirohito", false),
            Answer("Hideki Tojo", true),
            Answer("Isoroku Yamamoto", false),
            Answer("Kiyoshi Sato", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser l'estratègia aliada coneguda com \"island hopping\" a l'Oceà Pacífic?",
        listOf(
            Answer("Atacar només els grans ports japonesos", false),
            Answer("Bombardejar els vaixells enemics", false),
            Answer("Conquerir illes estratègiques per avançar cap al Japó", true),
            Answer("Evitar confrontacions directes amb les tropes japoneses", false)
        ).shuffled()
    ),
    Question(
        "Qui va ser el líder de la resistència francesa durant la Segona Guerra Mundial?",
        listOf(
            Answer("Charles de Gaulle", true),
            Answer("Philippe Pétain", false),
            Answer("Jean Moulin", false),
            Answer("Henri Giraud", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser la batalla decisiva entre les flotes dels Estats Units i Japó a l'oceà Pacífic el 1942?",
        listOf(
            Answer("Batalla de Coral Sea", false),
            Answer("Batalla de Guadalcanal", false),
            Answer("Batalla de Leyte Gulf", false),
            Answer("Batalla de Midway", true)
        ).shuffled()
    ),
    Question(
        "Quina era la principal estratègia del Pla Morgenthau als Estats Units després de la guerra?",
        listOf(
            Answer("Reconstrucció de l'Europa de l'Est", false),
            Answer("Convertir Alemanya en una societat agrícola", true),
            Answer("Establir un govern de marioneta a Berlín", false),
            Answer("Aïllar totalment els països de l'Eix", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser la primera ciutat del Japó que va ser bombardejada amb una bomba atòmica?",
        listOf(
            Answer("Tòquio", false),
            Answer("Hiroshima", true),
            Answer("Nagasaki", false),
            Answer("Kyoto", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser l'última batalla de la Segona Guerra Mundial a Europa?",
        listOf(
            Answer("Batalla de Berlín", true),
            Answer("Batalla d'Arnhem", false),
            Answer("Batalla de l'Operació Market Garden", false),
            Answer("Batalla de Stalingrad", false)
        ).shuffled()
    ),
    Question(
        "Quina data va acabar la Segona Guerra Mundial a Europa?",
        listOf(
            Answer("1 de novembre de 1945", false),
            Answer("7 de maig de 1945", false),
            Answer("8 de maig de 1945", true),
            Answer("9 de setembre de 1945", false)
        ).shuffled()
    )
).shuffled()

val nightmareQuestions: List<Question> = listOf(
    Question(
        "Quina va ser la primera batalla important en la qual l'aviació va jugar un paper decisiu durant la Segona Guerra Mundial?",
        listOf(
            Answer("Batalla de la Gran Bretanya", false),
            Answer("Batalla de Midway", false),
            Answer("Batalla de Coral Sea", true),
            Answer("Batalla de Guadalcanal", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom de la missió secreta que va desenvolupar els primers experiments nuclears dels Estats Units?",
        listOf(
            Answer("Projecte Manhattan", true),
            Answer("Operació Paperclip", false),
            Answer("Operació Overlord", false),
            Answer("Projecte Pegasus", false)
        ).shuffled()
    ),
    Question(
        "Quina ciutat va ser objecte d'un assalt brutal el 1944 per part de les forces soviètiques durant l'ofensiva a l'est?",
        listOf(
            Answer("Leningrad", false),
            Answer("Budapest", true),
            Answer("Varsòvia", false),
            Answer("Berna", false)
        ).shuffled()
    ),
    Question(
        "Quin comandant alemany va ser responsable de la fallida de l'Operació Market Garden?",
        listOf(
            Answer("Erwin Rommel", false),
            Answer("Heinz Guderian", false),
            Answer("Walter Model", true),
            Answer("Kurt Student", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser l'estratègia clau en la Batalla de Kursk que va permetre a l'Exèrcit Roig derrotar les forces alemanyes?",
        listOf(
            Answer("L'ús de tancs lleugers per a l'atac directe", false),
            Answer("Defensa en profunditat amb línies fortificades", true),
            Answer("Evitar la confrontació directa fins a l'últim moment", false),
            Answer("Una ofensiva de flanc amb forces aeris", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser la causa principal de la fallida de l'Operació Sea Lion (la invasió d'Anglaterra)?",
        listOf(
            Answer("La falta de suport logístic", false),
            Answer("El clima extremadament dur", false),
            Answer("L'estratègia de la guerra submarina", false),
            Answer("La superioritat aèria britànica", true)
        ).shuffled()
    ),
    Question(
        "Quina va ser la tàctica utilitzada pel general japonès Isoroku Yamamoto en la Batalla de Midway que va ser crucial per a la victòria aliada?",
        listOf(
            Answer("Atac directe a les bases enemigues", false),
            Answer("Un atac en diversos fronts", false),
            Answer("Desplegar les flotes de manera dispersa", false),
            Answer("Enganyar els enemics per atraure'ls a una zona de batalla", true)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom de la unitat d'elit japonesa responsable de l'atac a Nanking el 1937?",
        listOf(
            Answer("Kodoha", false),
            Answer("Kempeitai", true),
            Answer("Unit 731", false),
            Answer("Butai 16", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el secret de l'Operació Valkiria, el complot per assassinar Adolf Hitler?",
        listOf(
            Answer("Un atac amb gas tòxic", false),
            Answer("Una bomba oculta en una maleta", true),
            Answer("Un enverinament lent", false),
            Answer("Un atac aeri directament al búnquer", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom de la tàctica utilitzada per l'Exèrcit Roig a la Batalla de Stalingrad per a atrapar les forces alemanyes?",
        listOf(
            Answer("Guerra de guerrilles", false),
            Answer("Anell de ferro", true),
            Answer("Guerra de desgast", false),
            Answer("Guerra de trampes", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el paper d'Oswald Pohl durant la Segona Guerra Mundial?",
        listOf(
            Answer("Cap de les SS", true),
            Answer("Director del programa d'experimentació humana", false),
            Answer("Comandant de l'ofensiva a França", false),
            Answer("Secretari del Partit Nazi", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el nom de la llei que va permetre als Estats Units vendre armes als països aliats durant els primers anys de la guerra abans de la seva entrada formal?",
        listOf(
            Answer("Llei de préstec i arrendament", true),
            Answer("Llei de neutralitat", false),
            Answer("Llei de mobilització industrial", false),
            Answer("Llei de suport als aliats", false)
        ).shuffled()
    ),
    Question(
        "Quina va ser la gran fallida dels aliats a la Batalla de Dieppe en 1942?",
        listOf(
            Answer("L'ús excessiu de la força aèria", false),
            Answer("La falta d'atac aeri suportant la invasió", true),
            Answer("La força aliada va ser derrotada abans de tocar terra", false),
            Answer("La invasió va ser mal coordinar amb els grups d'espionatge", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el primer ministre de França que va col·laborar amb el règim nazi durant l'ocupació del país?",
        listOf(
            Answer("Charles de Gaulle", false),
            Answer("Philippe Pétain", true),
            Answer("Georges Vanier", false),
            Answer("Pierre Laval", false)
        ).shuffled()
    ),
    Question(
        "Quin va ser el motiu de la retirada de les tropes alemanyes a l'Operació Citadel a Kursk?",
        listOf(
            Answer("El clima extremadament fred", false),
            Answer("La manca de subministraments", false),
            Answer("La superioritat en el combat de blindats soviètic", true),
            Answer("La intervenció de les tropes nord-americanes", false)
        ).shuffled()
    )
).shuffled()