#BILAN 04

###Docker :
Un fichier Dockerfile est présent et fonctionnel.
###Integration continue:
Le projet est correctement lié à Travis pour le CI/CD.
###Spring:
Spring Boot a été utilisé pour construire ce projet.
###Tests unitaires et d'integration:
Les tests ont été setup, mais manque de temps pour écrire les tests.
###Methodologie agile/deliveries
Pour cause de manque d'organisation dans l'equipe et malentendu avec d'autres projets (notamment le cours de Mme Mirbel), nous n'avons pas ecrit les OIL-BILAN01, 02 et 03.
De meme, il n'y pas eu de tags ajoutés à nos commits permettant de suivre l'évolution du projet.
###Arborescence
```
│   .gitignore
│   .travis.yml
│   Dockerfile
│   OIL-BILAN04.md
│   pom.xml
│   README.md
│
├───.idea
│       .gitignore
│       compiler.xml
│       encodings.xml
│       jarRepositories.xml
│       misc.xml
│       runConfigurations.xml
│       vcs.xml
│       workspace.xml
│
├───appariement
│   │   .gitignore
│   │   mvnw
│   │   mvnw.cmd
│   │   pom.xml
│   │
│   ├───.mvn
│   │   └───wrapper
│   │           maven-wrapper.jar
│   │           maven-wrapper.properties
│   │
│   ├───src
│   │   ├───main
│   │   │   ├───java
│   │   │   │   └───com
│   │   │   │       └───rushb
│   │   │   │           └───appariement
│   │   │   │                   Appariement.java
│   │   │   │                   AppariementApplication.java
│   │   │   │
│   │   │   └───resources
│   │   │           application.properties
│   │   │
│   │   └───test
│   │       └───java
│   │           └───com
│   │               └───rushb
│   │                   └───appariement
│   │                           AppariementApplicationTests.java
│   │
│   └───target
│       │   appariement-0.0.1-SNAPSHOT.jar
│       │   appariement-0.0.1-SNAPSHOT.jar.original
│       │   dependencies.txt
│       │
│       ├───classes
│       │   │   application.properties
│       │   │
│       │   └───com
│       │       └───rushb
│       │           └───appariement
│       │                   Appariement.class
│       │                   AppariementApplication.class
│       │
│       ├───generated-sources
│       │   └───annotations
│       ├───generated-test-sources
│       │   └───test-annotations
│       ├───maven-archiver
│       │       pom.properties
│       │
│       ├───maven-status
│       │   └───maven-compiler-plugin
│       │       ├───compile
│       │       │   └───default-compile
│       │       │           createdFiles.lst
│       │       │           inputFiles.lst
│       │       │
│       │       └───testCompile
│       │           └───default-testCompile
│       │                   createdFiles.lst
│       │                   inputFiles.lst
│       │
│       ├───surefire-reports
│       │       com.rushb.appariement.AppariementApplicationTests.txt
│       │       TEST-com.rushb.appariement.AppariementApplicationTests.xml
│       │
│       └───test-classes
│           └───com
│               └───rushb
│                   └───appariement
│                           AppariementApplicationTests.class
│
├───joueur
│   │   .gitignore
│   │   mvnw
│   │   mvnw.cmd
│   │   pom.xml
│   │
│   ├───.mvn
│   │   └───wrapper
│   │           maven-wrapper.jar
│   │           maven-wrapper.properties
│   │
│   ├───src
│   │   ├───main
│   │   │   ├───java
│   │   │   │   └───com
│   │   │   │       └───rushb
│   │   │   │           └───joueur
│   │   │   │                   Combinaison.java
│   │   │   │                   Grille.java
│   │   │   │                   Joueur.java
│   │   │   │                   JoueurApplication.java
│   │   │   │
│   │   │   └───resources
│   │   │           application.properties
│   │   │
│   │   └───test
│   │       └───java
│   │           └───com
│   │               └───rushb
│   │                   └───joueur
│   │                           JoueurApplicationTests.java
│   │
│   └───target
│       │   dependencies.txt
│       │   joueur-0.0.1-SNAPSHOT.jar
│       │   joueur-0.0.1-SNAPSHOT.jar.original
│       │
│       ├───classes
│       │   │   application.properties
│       │   │
│       │   └───com
│       │       └───rushb
│       │           └───joueur
│       │                   Combinaison.class
│       │                   Grille.class
│       │                   Joueur.class
│       │                   JoueurApplication.class
│       │
│       ├───generated-sources
│       │   └───annotations
│       ├───generated-test-sources
│       │   └───test-annotations
│       ├───maven-archiver
│       │       pom.properties
│       │
│       ├───maven-status
│       │   └───maven-compiler-plugin
│       │       ├───compile
│       │       │   └───default-compile
│       │       │           createdFiles.lst
│       │       │           inputFiles.lst
│       │       │
│       │       └───testCompile
│       │           └───default-testCompile
│       │                   createdFiles.lst
│       │                   inputFiles.lst
│       │
│       ├───surefire-reports
│       │       com.rushb.joueur.JoueurApplicationTests.txt
│       │       TEST-com.rushb.joueur.JoueurApplicationTests.xml
│       │
│       └───test-classes
│           └───com
│               └───rushb
│                   └───joueur
│                           JoueurApplicationTests.class
│
├───partie
│   │   .gitignore
│   │   mvnw
│   │   mvnw.cmd
│   │   pom.xml
│   │
│   ├───.mvn
│   │   └───wrapper
│   │           maven-wrapper.jar
│   │           maven-wrapper.properties
│   │
│   ├───src
│   │   ├───main
│   │   │   ├───java
│   │   │   │   └───com
│   │   │   │       └───rushb
│   │   │   │           └───partie
│   │   │   │                   Partie.java
│   │   │   │                   PartieApplication.java
│   │   │   │
│   │   │   └───resources
│   │   │           application.properties
│   │   │
│   │   └───test
│   │       └───java
│   │           └───com
│   │               └───rushb
│   │                   └───partie
│   │                           PartieApplicationTests.java
│   │
│   └───target
│       │   dependencies.txt
│       │   partie-0.0.1-SNAPSHOT.jar
│       │   partie-0.0.1-SNAPSHOT.jar.original
│       │
│       ├───classes
│       │   │   application.properties
│       │   │
│       │   └───com
│       │       └───rushb
│       │           └───partie
│       │                   Partie.class
│       │                   PartieApplication.class
│       │
│       ├───generated-sources
│       │   └───annotations
│       ├───generated-test-sources
│       │   └───test-annotations
│       ├───maven-archiver
│       │       pom.properties
│       │
│       ├───maven-status
│       │   └───maven-compiler-plugin
│       │       ├───compile
│       │       │   └───default-compile
│       │       │           createdFiles.lst
│       │       │           inputFiles.lst
│       │       │
│       │       └───testCompile
│       │           └───default-testCompile
│       │                   createdFiles.lst
│       │                   inputFiles.lst
│       │
│       ├───surefire-reports
│       │       com.rushb.partie.PartieApplicationTests.txt
│       │       TEST-com.rushb.partie.PartieApplicationTests.xml
│       │
│       └───test-classes
│           └───com
│               └───rushb
│                   └───partie
│                           PartieApplicationTests.class
│
├───proba
│   │   .gitignore
│   │   mvnw
│   │   mvnw.cmd
│   │   pom.xml
│   │
│   ├───.mvn
│   │   └───wrapper
│   │           maven-wrapper.jar
│   │           maven-wrapper.properties
│   │
│   ├───src
│   │   ├───main
│   │   │   ├───java
│   │   │   │   └───com
│   │   │   │       └───rushb
│   │   │   │           └───proba
│   │   │   │                   ProbaApplication.java
│   │   │   │
│   │   │   └───resources
│   │   │           application.properties
│   │   │
│   │   └───test
│   │       └───java
│   │           └───com
│   │               └───rushb
│   │                   └───proba
│   │                           ProbaApplicationTests.java
│   │
│   └───target
│       │   dependencies.txt
│       │   proba-0.0.1-SNAPSHOT.jar
│       │   proba-0.0.1-SNAPSHOT.jar.original
│       │
│       ├───classes
│       │   │   application.properties
│       │   │
│       │   └───com
│       │       └───rushb
│       │           └───proba
│       │                   ProbaApplication.class
│       │
│       ├───generated-sources
│       │   └───annotations
│       ├───generated-test-sources
│       │   └───test-annotations
│       ├───maven-archiver
│       │       pom.properties
│       │
│       ├───maven-status
│       │   └───maven-compiler-plugin
│       │       ├───compile
│       │       │   └───default-compile
│       │       │           createdFiles.lst
│       │       │           inputFiles.lst
│       │       │
│       │       └───testCompile
│       │           └───default-testCompile
│       │                   createdFiles.lst
│       │                   inputFiles.lst
│       │
│       ├───surefire-reports
│       │       com.rushb.proba.ProbaApplicationTests.txt
│       │       TEST-com.rushb.proba.ProbaApplicationTests.xml
│       │
│       └───test-classes
│           └───com
│               └───rushb
│                   └───proba
│                           ProbaApplicationTests.class
│
└───target
        dependencies.txt
```
