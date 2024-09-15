
package com.uber.nullaway;

import com.sun.source.tree.BlockTree;
import com.sun.source.tree.MethodTree;
import com.sun.tools.javac.code.Symbol;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_NullAway_FieldInitEntities extends NullAway.FieldInitEntities {

  private final Symbol.ClassSymbol classSymbol;
  private final Set<Symbol> nonnullInstanceFields;
  private final Set<Symbol> nonnullStaticFields;
  private final List<BlockTree> instanceInitializerBlocks;
  private final List<BlockTree> staticInitializerBlocks;
  private final Set<MethodTree> constructors;
  private final Set<MethodTree> instanceInitializerMethods;
  private final Set<MethodTree> staticInitializerMethods;

  AutoValue_NullAway_FieldInitEntities(
      Symbol.ClassSymbol classSymbol,
      Set<Symbol> nonnullInstanceFields,
      Set<Symbol> nonnullStaticFields,
      List<BlockTree> instanceInitializerBlocks,
      List<BlockTree> staticInitializerBlocks,
      Set<MethodTree> constructors,
      Set<MethodTree> instanceInitializerMethods,
      Set<MethodTree> staticInitializerMethods) {
    if (classSymbol == null) {
      throw new NullPointerException("Null classSymbol");
    }
    this.classSymbol = classSymbol;
    if (nonnullInstanceFields == null) {
      throw new NullPointerException("Null nonnullInstanceFields");
    }
    this.nonnullInstanceFields = nonnullInstanceFields;
    if (nonnullStaticFields == null) {
      throw new NullPointerException("Null nonnullStaticFields");
    }
    this.nonnullStaticFields = nonnullStaticFields;
    if (instanceInitializerBlocks == null) {
      throw new NullPointerException("Null instanceInitializerBlocks");
    }
    this.instanceInitializerBlocks = instanceInitializerBlocks;
    if (staticInitializerBlocks == null) {
      throw new NullPointerException("Null staticInitializerBlocks");
    }
    this.staticInitializerBlocks = staticInitializerBlocks;
    if (constructors == null) {
      throw new NullPointerException("Null constructors");
    }
    this.constructors = constructors;
    if (instanceInitializerMethods == null) {
      throw new NullPointerException("Null instanceInitializerMethods");
    }
    this.instanceInitializerMethods = instanceInitializerMethods;
    if (staticInitializerMethods == null) {
      throw new NullPointerException("Null staticInitializerMethods");
    }
    this.staticInitializerMethods = staticInitializerMethods;
  }

  @Override
  Symbol.ClassSymbol classSymbol() {
    return classSymbol;
  }

  @Override
  Set<Symbol> nonnullInstanceFields() {
    return nonnullInstanceFields;
  }

  @Override
  Set<Symbol> nonnullStaticFields() {
    return nonnullStaticFields;
  }

  @Override
  List<BlockTree> instanceInitializerBlocks() {
    return instanceInitializerBlocks;
  }

  @Override
  List<BlockTree> staticInitializerBlocks() {
    return staticInitializerBlocks;
  }

  @Override
  Set<MethodTree> constructors() {
    return constructors;
  }

  @Override
  Set<MethodTree> instanceInitializerMethods() {
    return instanceInitializerMethods;
  }

  @Override
  Set<MethodTree> staticInitializerMethods() {
    return staticInitializerMethods;
  }

  @Override
  public String toString() {
    return "FieldInitEntities{"
        + "classSymbol=" + classSymbol + ", "
        + "nonnullInstanceFields=" + nonnullInstanceFields + ", "
        + "nonnullStaticFields=" + nonnullStaticFields + ", "
        + "instanceInitializerBlocks=" + instanceInitializerBlocks + ", "
        + "staticInitializerBlocks=" + staticInitializerBlocks + ", "
        + "constructors=" + constructors + ", "
        + "instanceInitializerMethods=" + instanceInitializerMethods + ", "
        + "staticInitializerMethods=" + staticInitializerMethods
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NullAway.FieldInitEntities) {
      NullAway.FieldInitEntities that = (NullAway.FieldInitEntities) o;
      return (this.classSymbol.equals(that.classSymbol()))
           && (this.nonnullInstanceFields.equals(that.nonnullInstanceFields()))
           && (this.nonnullStaticFields.equals(that.nonnullStaticFields()))
           && (this.instanceInitializerBlocks.equals(that.instanceInitializerBlocks()))
           && (this.staticInitializerBlocks.equals(that.staticInitializerBlocks()))
           && (this.constructors.equals(that.constructors()))
           && (this.instanceInitializerMethods.equals(that.instanceInitializerMethods()))
           && (this.staticInitializerMethods.equals(that.staticInitializerMethods()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.classSymbol.hashCode();
    h *= 1000003;
    h ^= this.nonnullInstanceFields.hashCode();
    h *= 1000003;
    h ^= this.nonnullStaticFields.hashCode();
    h *= 1000003;
    h ^= this.instanceInitializerBlocks.hashCode();
    h *= 1000003;
    h ^= this.staticInitializerBlocks.hashCode();
    h *= 1000003;
    h ^= this.constructors.hashCode();
    h *= 1000003;
    h ^= this.instanceInitializerMethods.hashCode();
    h *= 1000003;
    h ^= this.staticInitializerMethods.hashCode();
    return h;
  }

}
