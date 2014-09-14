package favor.domain.component.converters;

interface Parser
{
    Parser INTEGER = new Parser()
    {
        @Override
        public Object parse(String input)
        {
            return Integer.parseInt(input);
        }
    };

    Parser LONG = new Parser()
    {
        @Override
        public Object parse(String input)
        {
            return Long.parseLong(input);
        }
    };

    Parser DOUBLE = new Parser()
    {
        @Override
        public Object parse(String input)
        {
            return Double.parseDouble(input);
        }
    };

    Parser BOOLEAN = new Parser()
    {
        @Override
        public Object parse(String input)
        {
            return Boolean.parseBoolean(input);
        }
    };

    Object parse(String input);
}
