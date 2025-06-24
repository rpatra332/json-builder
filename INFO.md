## Phase 1 – Flat Object Serialization (No Nested Objects Yet)
This is your foundation. You’ll focus only on serializing simple POJOs with primitive types, String, and Boolean. No recursion, no collections, no arrays yet.

### Goal
Convert a flat Java object to a JSON string like:

### What You Need to Implement

`toJson(Object obj)`:
	*  Get class using obj.getClass()
	* Loop through all declared fields: getDeclaredFields()
	* For each field:
		* setAccessible(true)
		* Get name and value
	* Format based on type (String gets quotes, numbers/booleans don’t)