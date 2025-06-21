    // Document Interface
    interface Document {
        void open();
    }

    // Concrete Document Classes
    class WordDocument implements Document {
        public void open() {
            System.out.println("Opening Word document...");
        }
    }

    class PdfDocument implements Document {
        public void open() {
            System.out.println("Opening PDF document...");
        }
    }

    class ExcelDocument implements Document {
        public void open() {
            System.out.println("Opening Excel document...");
        }
    }

    // Abstract Document
    abstract class DocumentFactory {
        public abstract Document createDocument();
    }

    // Concrete classes
    class WordDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new WordDocument();
        }
    }

    class PdfDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new PdfDocument();
        }
    }

    class ExcelDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new ExcelDocument();
        }
    }