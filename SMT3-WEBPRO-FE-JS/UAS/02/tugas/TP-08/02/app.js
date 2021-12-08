const vm = new Vue({
    el: "#app",
    data: {
        nama: '',
        books: []
    },
    methods: {
        async getBooks() {
            const config = {
                method: 'get',
                url: 'https://openlibrary.org/search.json?q=computer&fields=title&limit=12'
            };
            const response = await axios(config);
            this.books = response.data.docs;
        }
    },
    computed: {
        filterBooks() {
            return this.books.filter(b => b.title.toLowerCase().match(this.nama.toLowerCase()));
        }
    },
    created() {
        this.getBooks();
    }
});
