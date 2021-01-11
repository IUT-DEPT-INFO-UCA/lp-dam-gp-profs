# Modèle du Dépôt
Le sujet du Projet se trouve sous : https://iut-dept-info-uca.github.io/LP-DAM-IOTIA-Project-ENONCE/

L'énoncé pour gérer un projet sous github :  https://lms.univ-cotedazur.fr/mod/book/view.php?id=244277

Ce répertoire est composé : 
- d'un _.gitignore_ : pour ne pas polluer le dépôt avec des fichiers qui ne doivent pas être versionnés - **Complétez le en fonction de vos choix technologiques : langage, environnement de développement**
- d'un _README_ (README.md) : fichier au [format markdown](https://guides.github.com/features/mastering-markdown/)
- _src_ : les sources java du projet structuré comme attendu par un projet _maven_ - **Ils permettent de tester l'intégration continue - Vous les enleverez en fonction de vos choix technologiques **
- _.github/ISSUE_TEMPLATE/_ : Les modèles d'issues à utiliser dans le projet et à compléter
- _.github/workflows_ : les codes utiles pour l'intégration continue avec [Github Actions](https://github.com/features/actions) - **A adapter par la suite en fonction de vos choix technologiques **
- _pom.xml_ : Dans ce fichier [POM](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html) vous trouvez entre autres, l'encodage, la version java utilisée, la version de junit :
```xml
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <version.junit>5.6.2</version.junit>
```
et les dépendances aux codes associées
```xml
<dependency>
    	<groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>${version.junit}</version>
        <scope>test</scope>
     </dependency>
```

