# Exercice 4 : Polymorphisme

Dans la classe `NoEtablissement`, on peut voir une opportunité manquée d'utiliser du polymorphisme. L'objectif était de
supporter deux types d'ID (les anciens qui sont des chiffres, et les nouveaux qui sont des UUID).

Cette implémentation maladroite mène à quelques complications :

- Dans les méthodes `equals`, `hashCode` et `asString`: il faut toujours commencer par voir quel "version" est utilisée
  avant de poser une action
- La méthode `genererV1` est dépréciée, mais elle devrait idéalement être simplement supprimée, vu qu'elle ne fait
  que lancer une exception
- Dans la méthode `InspectionRessource::etatDesEquipements`, la ressource REST doit connaitre les versions du numéro. On peut
  facilement imaginer que cette connaissance devra être dupliquée dans toutes les méthodes qui gèrent des numéros
  d'établissement

Procédez à un refactoring (réusinage) du code afin d'utiliser du polymorphisme et régler ces problèmes. Pensez également
à une façon d'éviter que le code servant a identifié la version de l'ID ne soit dupliqué dans toutes les ressources. Un
_design pattern_ tel que la [factory](https://www.baeldung.com/java-factory-pattern) (ou la factory method aussi
mentionnée dans cet article, faites un choix judicieux!).

_Note_: Les méthodes `equals` et `hashCode` doivent demeurer, celles-ci sont nécessaires pour la BD (une HashMap).

