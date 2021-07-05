public interface Animal { public default String getName() { return null; } }
interface Mammal { public default String getName() { return null; } }
abstract class Otter implements Mamma, Animal {}

// What needs to be removed in order to work?