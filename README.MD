[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/1g8PcTQH)

# Funcionalitats fetes

## Menu Screen
La pantalla funciona correctament i conté tots els components.
Butó per a començar el joc, que t'envia a la pantalla de joc.
Butó per a la configuració del joc, que t'envia a la pantalla de configuració.

## Pregunta resposta funcional
Les preguntes i respostes apareixen correctament en la pantalla de joc.
Cada ronda té una pregunta amb 4 possibles respostes, de les quals només una és correcte, al seleccionar una es passa a la següent ronda, i si no queden rondes s'acaba el joc i t'envia a la pantalla final.
En la pantalla final es pot veure la puntuació realitzada que correspon a les preguntes encertades.

## Look and Feel
Visualment és agrdable de veure i el canvi entre pantalles és suau.

## Posició resposta correcte aleatòria
Cada resposta de cada pregunta està en una posició aleatòria cada vegada que s'executa l'aplicació.

## Settings
Les configuracións de dificultat, rondes i temps per ronda funcionen correctament.
Segons la dificultat les preguntes són més fàcils o més difícils.
Les rondes poden ser personalitzades, entre els valors de 5, 10 i 15.
Hi ha un temporitzador amb una barra de progres que va baixant indicant el temps restant per ronda.

## Generació de preguntes aleatòries
Les preguntes són aleatòries cada vegada que s'executa l'apliació.

## Compte enrere
Una barra de progres en la pantalla de joc indica el temps restant per ronda que queda, un cop acaba passa a la seguent ronda, encara que no s'hagui respòs a la pregunta.
El temps es reinicialitza cada vegada que es canvia de ronda.

# Template for Compose Multiplatform DAM78 exercices

Project to be used as a template for DAM78 exercices

## Running

### Android
To run the application on android device/emulator:  
 - open project in Android Studio and run imported android run configuration

To build the application bundle:
 - run `./gradlew :composeApp:assembleDebug`
 - find `.apk` file in `composeApp/build/outputs/apk/debug/composeApp-debug.apk`
Run android UI tests on the connected device: `./gradlew :composeApp:connectedDebugAndroidTest`

### Desktop
Run the desktop application: `./gradlew :composeApp:run`
Run desktop UI tests: `./gradlew :composeApp:jvmTest`

You can also configure a gradle run task in Intellij

### iOS
To run the application on iPhone device/simulator:
 - Open `iosApp/iosApp.xcproject` in Xcode and run standard configuration
 - Or use [Kotlin Multiplatform Mobile plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile) for Android Studio
Run iOS simulator UI tests: `./gradlew :composeApp:iosSimulatorArm64Test`

## Notes
This project has been created with https://terrakok.github.io/Compose-Multiplatform-Wizard/
