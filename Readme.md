# uima-regex-filter

UIMA analysis engine for filtering in/out annotations by regular expression. As far the value of `Annotation.getCoveredText()` are
searched.

## Configuration Parameters

### FilterOut (boolean)

Whether `Pattern` is used for filtering "out" or filtering "in". If this parameter is flagged, all the matched annotations are removed from the annotation index. If it's not flagged, annotations other than the matched ones are removed.

### Pattern (String)

Regular expression used for matching.

### Type (String)

Fully qualified class name of the annotation to be filtered.

## License

The MIT License (MIT)

Copyright (c) 2013 Ryo Murayama &lt;utatanenohibi@gmail.com&gt;

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
