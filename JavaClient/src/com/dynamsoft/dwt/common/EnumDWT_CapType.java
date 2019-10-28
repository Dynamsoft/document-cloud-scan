package com.dynamsoft.dwt.common;


/// Capabilities exist in many varieties but all have a Default Value; Current Value; and may have other values available that can be supported if selected. 
/// To help categorize the supported values into clear structures; TWAIN defines four types of containers for capabilities = 
/// TW_ONEVALUE; TW_ARRAY; TW_RANGE and TW_ENUMERATION.
public interface EnumDWT_CapType{
  /// Nothing.
  int TWON_NONE = 0;
  /// A rectangular array of values that describe a logical item. It is similar to the TW_ONEVALUE because the current and default values are the same and 
  /// there are no other values to select from. For example; a list of the names; such as the supported capabilities list returned by the CAP_SUPPORTEDCAPS 
  /// capability; would use this type of container. 
  int TWON_ARRAY = 3;
  /// This is the most general type because it defines a list of values from which the Current Value can be chosen. 
  /// The values do not progress uniformly through a range and there is not a consistent step size between the values. 
  /// For example; if a Source's resolution options do not occur in even step sizes then an enumeration would be used (for example; 150; 400; and 600). 
  int TWON_ENUMERATION = 4;
  /// A single value whose current and default values are coincident. The range of available values for this type of capability is simply this single value.
  /// For example; a capability that indicates the presence of a document feeder could be of this type.
  int TWON_ONEVALUE = 5;
  /// Many capabilities allow users to select their current value from a range of regularly spaced values. 
  /// The capability can specify the minimum and maximum acceptable values and the incremental step size between the values.
  /// For example; resolution might be supported from 100 to 600 in steps of 50 (100; 150; 200; ...; 550; 600). 
  int TWON_RANGE = 6;
}
