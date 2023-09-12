# Exercice : Un peu de ménage!

La classe `ServiceInspection` est, en bon français, un _mess_!

Avant de faire un _refactoring_ (réusinage) en profondeur de cette classe, il est important de la rendre lisible, afin
d'éviter de faire des erreurs lors du refactoring.

Dans cet objectif, rendez le code de `ServiceInspection` plus lisible en utilisant les concepts de Clean Code vu dans
vos cours précédents. Vous pouvez créer d'autres classes, extraire des fonctions, etc. au besoin, mais limitez-vous
aux problèmes de Clean Code. Si vous essayez de tout réécrire d'un seul coup, vous ferez inévitablement des erreurs.

_Note_: Afin d'éviter des problèmes de Clean Code dans le futur, il existe des outils tels que
[checkstyle](https://checkstyle.sourceforge.io/). Ne l'ajoutez pas au projet dans le cadre de ce TP, mais vous pourriez le considérer dans le cadre
de votre projet d'équipe plus tard dans la session! Vous trouverez des instructions d'installation
[ici](https://maven.apache.org/plugins/maven-checkstyle-plugin/usage.html). Il existe aussi des configurations pré-faites, telles que [celle de google](https://github.com/checkstyle/checkstyle/blob/master/src/main/resources/google_checks.xml),
mais n'hésitez pas à la modifier si vous n'aimez pas certains aspects! Par exemple,
personnellement, je trouve qu'une longueur de ligne maximale à 100 est plutôt bas, je préfère 160 (on a tous
des moniteurs 1080p de nos jours!).
