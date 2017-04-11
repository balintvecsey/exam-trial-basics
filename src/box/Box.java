package box;

class Cuboid {
  // Create a class that represents a cuboid:
  // It should take its three dimensions as constructor parameters (numbers)
  // It should have a method called `getSurface` that returns the cuboid's surface
  // It should have a method called `getVolume` that returns the cuboid's volume
  int a;
  int b;
  int c;

  public Cuboid(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int getSurface() {
    return 2 * (a*b + a*c + b*c);
  }

  public int getVolume() {
    return a*b*c;
  }
}
