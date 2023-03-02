using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EFCodeFirst.Models
{
    internal class Post
    {
        public string NamePost { get; set; }
        public string Text { get; set; }
        public DateTime PublicationTime { get; set; }
        public bool IsPublished { get; set; }

    }
}
